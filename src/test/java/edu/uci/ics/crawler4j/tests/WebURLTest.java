package edu.uci.ics.crawler4j.tests;

import edu.uci.ics.crawler4j.frontier.WebURLAdditionalData;
import org.junit.Test;

import edu.uci.ics.crawler4j.url.WebURL;


/**
 * Created by Avi on 8/19/2014.
 *
 */
public class WebURLTest {

  @Test
  public void testNoLastSlash() {
    WebURL webUrl = new WebURL(new WebURLAdditionalData());
    webUrl.setURL("http://google.com");
  }
}