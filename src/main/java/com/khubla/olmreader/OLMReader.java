package com.khubla.olmreader;

import java.io.IOException;
import java.util.List;

import com.khubla.olmreader.olm.generated.EmailAddress;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

import com.khubla.olmreader.olm.OLMFile;
import com.khubla.olmreader.olm.OLMMessageCallback;
import com.khubla.olmreader.olm.OLMRawMessageCallback;
import com.khubla.olmreader.olm.generated.Categories;
import com.khubla.olmreader.olm.generated.Emails;

public class OLMReader implements OLMMessageCallback, OLMRawMessageCallback {
   /**
    * file option
    */
   private static final String FILE_OPTION = "file";

   public static void main(String[] args) throws IOException {
      //System.out.println("khubla.com OLM Reader");
      /*
       * options
       */
      final Options options = new Options();
      final Option oo = Option.builder().argName(FILE_OPTION).longOpt(FILE_OPTION).type(String.class).hasArg().required(true).desc("file to compile").build();
      options.addOption(oo);
      /*
       * parse
       */
      final CommandLineParser parser = new DefaultParser();
      CommandLine cmd = null;
      try {
         cmd = parser.parse(options, args);
      } catch (final Exception e) {
         e.printStackTrace();
         final HelpFormatter formatter = new HelpFormatter();
         formatter.printHelp("posix", options);
         System.exit(0);
      }
      /*
       * get the file
       */
      final String filename = cmd.getOptionValue(FILE_OPTION);
      if (null != filename) {
         final OLMReader olmReader = new OLMReader();
         olmReader.read(filename);
      }
   }

   private OLMFile olmFile;

   @Override
   public void categories(Categories categories) {
      //System.out.println(categories.getCategory().size());
   }

   @Override
   public void message(Emails.Email email) {
      String from = "";
      if (email.getOPFMessageCopyFromAddresses() != null) {
         List<EmailAddress> emailAddresses = email.getOPFMessageCopyFromAddresses().getEmailAddress();
         assert emailAddresses.size() < 2;
         if (!emailAddresses.isEmpty())
            from = emailAddresses.get(0).getOPFContactEmailAddressAddress().toLowerCase();
      }

      String to = "";
      if (email.getOPFMessageCopyToAddresses() != null) {
         for (EmailAddress e : email.getOPFMessageCopyToAddresses().getEmailAddress()) {
            if (to.length() > 0) to += ",";
            to += e.getOPFContactEmailAddressAddress().toLowerCase();
         }
      }

      String cc = "";
      if (email.getOPFMessageCopyCCAddresses() != null) {
         for (EmailAddress e : email.getOPFMessageCopyCCAddresses().getEmailAddress()) {
            if (cc.length() > 0) to += ",";
            cc += e.getOPFContactEmailAddressAddress().toLowerCase();
         }
      }

      String sentTime = email.getOPFMessageCopySentTime().getValue();

      System.out.println(String.format("\"%s\",\"%s\",\"%s\",\"%s\"", from, to, cc, sentTime));
   }

   @Override
   public void rawMessage(String olmMessage) {
      // System.out.println(olmMessage);
   }

   public void read(String filename) throws IOException {
      System.out.println("\"from\",\"to\",\"cc\",\"sent_time\"");
      olmFile = new OLMFile(filename);
      olmFile.readOLMFile(this, this);
   }
}
