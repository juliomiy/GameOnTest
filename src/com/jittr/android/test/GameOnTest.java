package com.jittr.android.test;

import junit.framework.Assert;

import com.jittr.android.foursquare.GOFoursquareWrapper;
import com.jittr.android.gamemanager.*;

import android.app.Activity;
import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.test.AndroidTestCase;
import android.test.ApplicationTestCase;

public class GameOnTest extends ApplicationTestCase {
	private Context context;
	private Activity activity;
	private GOFoursquareWrapper fs;

	public GameOnTest() {
		 super(GameManagerApplication.class);	
	}
	protected void setUp() throws Exception {
	   	 try {
			super.setUp();
	     } catch (Exception e) {
				e.printStackTrace();
		 }
         createApplication();
         context = this.getContext();
		 fs = new GOFoursquareWrapper(context);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testPreConditions() {
		Assert.assertNotNull("Foursquare object Not Null", fs);
	}
	public void testGetConsumerKey() {
	    Assert.assertEquals("retrieve ConsumerKey", fs.getConsumerKey(),"AROV4OCBZMPAMSHLCF3LLYWQQ0W0F2WH1K1BDZDGBW1OFJSM");	
	}

	public void testTrivialFail() {
		Assert.assertTrue("Fail on purpose", false);
	}
	public void testGetConsumerSecretKey() {
	    Assert.assertEquals("retrieve ConsumerSecretKey", fs.getConsumerSecretKey(),"IT5NN1BSTKCORZ3YVC32BRAJD5O4201TCCAGAK2KAMUYHOQD");	
	}

	/* test returns true if accessToken and accessTokenSecret are set */
	public void testIsAuthorizedTrue() {
		Assert.assertTrue("AccessToken and AccessTokenSecret set", fs.isAuthorized());
	}
	/* test returns false if accessToken or accessTokenSecret are not set*/
	public void testIsAuthorizedFalse() {
	   Assert.assertFalse("Either accessToken or accessTokenSecret not set", fs.isAuthorized());	
	}
	/*public void testGetAuthUrl() {
		Assert.assertNotNull("AuthUrl is null- Bad",fs.getAuthUrl());
	}*/

	public void testTrivial() {
		Assert.assertEquals(true, true);
	}
}
