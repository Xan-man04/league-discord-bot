package xan.League.Commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xan.League.League;

public class Rules extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(League.prefix + "rules")) {
			String message = "**__Rules and Guidelines__**\r\n"
					+ "```-Do not organize, participate in, or encourage harassment of others. \r\n"
					+ "-Do not organize, promote, or coordinate servers around hate speech. \r\n"
					+ "-Do not make threats of violence or threaten to harm others. \r\n"
					+ "-Do not evade user blocks or server bans. Do not send unwanted, repeated friend requests or messages, \r\n"
					+ "-Do not send others viruses or malware, attempt to phish others, or hack or DDoS them.\r\n"
					+ "-You may not sexualize minors in any way. \r\n"
					+ "-No Spam or flooding the chat with messages.\r\n"
					+ "-No bashing or heated arguments to other people in the chat.\r\n"
					+ "-No adult (18+), explicit, or controversial messages.\r\n"
					+ "-No racism or degrading content.\r\n"
					+ "-No excessive cursing.\r\n"
					+ "-No advertising  (Only with Permission).\r\n"
					+ "-No referral links.\r\n"
					+ "-Inviting bots is NOT ALLOWED without administrative approval, any bots that are found will be INSTANTLY BANNED.```\r\n"
					+ "\r\n"
					+ "**__Voice Chat Rules__**\r\n"
					+ "```-No voice chat surfing or switching channels repeatedly.\r\n"
					+ "-No annoying, loud or high pitch noises.\r\n"
					+ "-Reduce the amount of background noise, if possible. Resort to push to talk in your settings to reduce the issue.\r\n"
					+ "-You will be removed if sound quality is poor to other members.```\r\n"
					+ "\r\n"
					+ "**Any broken rules will result in an immediate ban.**";
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(message).queue();
		}
	}
}
