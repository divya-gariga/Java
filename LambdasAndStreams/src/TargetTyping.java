public class TargetTyping {
    public interface Email {
        String constructEmail(String name);
    }
    public String getEmail(String name,Email email)
    {
        return email.constructEmail(name);
    }

    public static void main(String[] args) {
        TargetTyping targetTyping=new TargetTyping();
        Email email=(String name)->name + "@gmail.com";
        System.out.println(targetTyping.getEmail("Divya",(String name)->name + "@gmail.com"));
    }
}
