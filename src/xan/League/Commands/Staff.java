package xan.League.Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xan.League.League;

public class Staff extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(League.prefix + "staff")) {
			String message = "**__Owner__  -**  **Xan**\r\n"
					+ "```The owner makes all executive decisions that happen in the league and server and guide the staff and players to keep the league at its best.```\r\n"
					+ "\r\n"
					+ "**__Admins__  -**  **Velops ,  Threes**\r\n"
					+ "```Admins put in just as much work as the owner and help come up with ideas and make sure all other staff are doing there job properly.```\r\n"
					+ "\r\n"
					+ "**__Moderators__  -**  **N/A**\r\n"
					+ "```Moderators or mods help moderate chat and give support to members who have any questions. They help keep the discord safe from toxicity and and broken rules.```\r\n"
					+ "\r\n"
					+ "**__Stream Staff__  -**  **N/A**\r\n"
					+ "```The stream staff run all streams making sure we provide a clean and professional streaming environment and to keep everyone entertained.```\r\n"
					+ "\r\n"
					+ "**__Casters__  -**  **N/A**\r\n"
					+ "```Casters have a similar role to Stream Staff but casters keep the viewers entertained through play by play casting and after game analysts.```\r\n"
					+ "\r\n"
					+ "**__Sheets Staff__  -**  **N/A**\r\n"
					+ "```Sheets staff keep track of staff sheets and report game scores into a sheet to be later added into liquipedia via our liquipedia staff.```\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "**__Liquipedia Staff__  -**  **N/A**\r\n"
					+ "```Liquipedia staff help keep our liquipedia page up to date by taking reported scores and putting them into our liquipedia page for the public to view.```\r\n"
					+ "\r\n"
					+ "**__Staff Application__**\r\n"
					+ "https://forms.gle/sMbE3heKUbRQA9b87";
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(message).queue();
		}
	}
}
