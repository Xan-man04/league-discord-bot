package xan.League.Commands;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xan.League.League;

public class Announcement extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		String message = event.getMessage().getContentRaw();
		int index = args[0].length();
		message = message.substring(index);
		if(args[0].equalsIgnoreCase(League.prefix + "createannouncement")) {
			
			TextChannel textChannel = event.getGuild().getTextChannelsByName("announcements",true).get(0);
			textChannel.sendMessage(message).queue();
		}
	}
}