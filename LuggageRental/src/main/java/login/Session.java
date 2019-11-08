package login;

import org.springframework.stereotype.Component;

@Component
public class Session {
	
	private ClientFacade clientFacade;
	public ClientFacade getClientFacade() {
		return clientFacade;
	}
	public long getLastAccesed() {
		return lastAccesed;
	}
	public void setClientFacade(ClientFacade clientFacade) {
		this.clientFacade = clientFacade;
	}
	public void setLastAccesed(long lastAccesed) {
		this.lastAccesed = lastAccesed;
	}
	private long lastAccesed;
	@Override
	public String toString() {
		return "Session [clientFacade=" + clientFacade + ", lastAccesed=" + lastAccesed + "]";
	}

}
