package xan.League.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xan.League.League;

public class Info extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(League.prefix + "help")) {
			EmbedBuilder help = new EmbedBuilder();
			help.setTitle("League bot help");
			help.addField("Info","This bot was designed to help run League name with a better reporting"
					+ " system in mind",false);
			help.setColor(0x03fc24);
			help.addField("Commands",".help - This command brings up all other commands for the bot"
					+ "\r\n 2"
					+ "\r\n 3",false);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(help.build()).queue();
		}
	}
	
}
