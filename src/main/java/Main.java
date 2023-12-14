public class  Main {
    public static void main(String[] args) {

        GEmailSender gEmailSender = new GEmailSender();
        String to = "youssafouhba@gmail.com";
        String from = "youssefouhba@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "Hello How are you !!!";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }

    }
}
