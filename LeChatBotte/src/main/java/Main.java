import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.MessageActivity.Application;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] argv) throws LoginException {

        String monToken = "ODE2MjYwNDk2MDUwMjI1MTUy.YD4X0w.H6ehRFYL51nyeyfwUOpabvMJMr0";

        JDABuilder builder = new JDABuilder(AccountType.*bot *);
        builder.setToken(monToken);
        builder.addEventListeners(new Application());
        builder.build();
    }
}
