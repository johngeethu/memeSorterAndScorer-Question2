package comcast;

import java.util.HashMap;
import java.util.Map;


public class MemeLulz extends Meme{
	private Map<String, String> memesMap = new HashMap<String,String>();
	private Map<String, Integer> lulzMap = new HashMap<String,Integer>();
	
	@Override
	public String toString() {
		return "{" + getMemesMap().keySet().toString() + lulzMap.keySet().toString() + "}";		
	}

	/*
	public Map<String, String> getMemesMap() {
		return memesMap;
	}

	public void setMemesMap(Map<String, String> memesMap) {
		this.memesMap = memesMap;
	}
	*/
	public Map<String, Integer> getLulzMap() {
		return lulzMap;
	}
	public void setLulMap(Map<String, Integer> lulzMap) {
		this.lulzMap = lulzMap;
	}

}
