class MyReader {
    // -------------- unrelated functions
    public boolean validateLocation(String pathIP) {
         return ping(pathIP) && checkFTP(pathIP);
    }
    private boolean checkFTP(String pathIP) {
         return true;
    }

    private boolean ping(String pathIP) {
          return true;
    }

    // -------------- functions related to read resource

    
    //reads file using corresponding file location
    public String readFile(String fileName, String fileLocationType) {
    	String data = null;
    	
    	if (fileLocationType == "Disk") {
    		data = readFromDisk(fileName);
    	} else if (fileLocationType == "Web") {
    		data = readFromWeb(fileName);
    	} else if (fileLocationType == "Network") {
    		data = readFromNetwork(fileName);
    	}
    	
    	return data;    
    
    }
    
    // read the resource from disk
    public String readFromDisk(String fileName) {
         return "data of " + fileName;
    }

    // read the resource from web
    public String readFromWeb(String url) {
         return "data of " + url;
    }

    // read the resource from network
    public String readFromNetwork(String networkAddress) {
         return "data of " + networkAddress;
    }

}
