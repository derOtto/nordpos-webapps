/**
 * Copyright (c) 2014 Nord Trading Ltd.
 */
package mobi.nordpos.device.action;

import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

/**
 * @author Andrey Svininykh <svininykh@gmail.com>
 */
public class HelloGuestActionBean extends BaseActionBean {

    private static final String HELLO = "/WEB-INF/jsp/hello_guest.jsp";

    private String guestName;

    public Resolution helloGuest() {
        return new ForwardResolution(HELLO);
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}
