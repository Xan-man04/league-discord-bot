package xan.League;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import xan.League.Commands.Info;
import xan.League.Commands.Rules;
import xan.League.Commands.Staff;
import xan.League.Commands.Announcement;

public class League {
	
    public static String prefix = ".";

    public static void main(String[] args) throws LoginException {
    	
    	JDA jda = JDABuilder.createDefault("ODA5MjEwNDQ1ODY0MzcwMTc4.YCRx9A.XHJiM4Azirl9FT78IjeJvzl-BI0").build();
    	jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
    	jda.getPresence().setActivity(null);
    	
    	jda.addEventListener(new Info());
    	jda.addEventListener(new Staff());
    	jda.addEventListener(new Rules());
    	jda.addEventListener(new Announcement());
    }
}
