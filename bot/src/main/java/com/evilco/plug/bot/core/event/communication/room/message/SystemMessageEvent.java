package com.evilco.plug.bot.core.event.communication.room.message;

import com.evilco.plug.bot.core.communication.PageCommunicationAdapter;
import com.evilco.plug.bot.core.communication.data.Message;

/**
 * @auhtor Johannes Donath <johannesd@evil-co.com>
 * @copyright Copyright (C) 2014 Evil-Co <http://www.evil-co.org>
 */
public class SystemMessageEvent extends MessageEvent {

	/**
	 * Constructs a new System Message Event.
	 * @param source
	 * @param message
	 */
	public SystemMessageEvent (PageCommunicationAdapter source, Message message) {
		super (source, message);
	}
}
