package com.google.u2f.server.data;

public class SessionData {
  private final String accountName;
  private final byte[] challenge;
  private final String appId;

  public SessionData(String accountName, String appId, byte[] challenge) {
    this.accountName = accountName;
    this.challenge = challenge;
    this.appId = appId;
  }

  public String getAccountName() {
    return accountName;
  }

  public byte[] getChallenge() {
    return challenge;
  }
  
  public String getAppId() {
	return appId; 
  }
}
