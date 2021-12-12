//#4. In given Facade Design Pattern example, make necessary changes, to add HardwareModule, with methods such as getStatus(), sendData(), recvData()

class HardwareModule{
	public void getStatus() {
		System.out.println("getStatus() in HardwareModule");
	}
	public void sendData() {
		System.out.println("sendData() in HardwareModule");
	}
	public void recvData() {
		System.out.println("receivingData() in HardwareModule");
	}
}

class FileSystem{

   public void readFile() {
      System.out.println("readFile() in FileSystem");
   }
}

class Network {

   public void sendData() {
      System.out.println("sendData() in Network");
   }
}


class Display {

   public void draw() {
      System.out.println("draw() in Display");
   }
}

class AppLifeCycle {

   public void startApp() {
      System.out.println("startApp() in AppLifeCycle");
   }
}

interface OSAPI{
    public void readFileOS();
    public void sendDataOS();
    public void startAppOS();
    public void drawOS(); 
    public void getStatus();
    public void sendData();
    public void recvData();
} 

class FacadeClass implements OSAPI{
      public void readFileOS(){
          new FileSystem().readFile();
      }
      
    public void sendDataOS(){
            new Network().sendData();
    }
    
    public void startAppOS(){
        new AppLifeCycle().startApp();
    }
    
    public void drawOS(){
        new Display().draw();
    }

	@Override
	public void getStatus() {
		// TODO Auto-generated method stub
		new HardwareModule().getStatus();
		
	}

	@Override
	public void sendData() {
		// TODO Auto-generated method stub
		new HardwareModule().sendData();
		
	}

	@Override
	public void recvData() {
		// TODO Auto-generated method stub
		new HardwareModule().recvData();
	}
}

public class FacadeExample {
   public static void main(String[] args) {
      FacadeClass obj = new FacadeClass();

      obj.drawOS();
      obj.readFileOS();
      obj.sendDataOS();
      obj.startAppOS();
      obj.sendData();
      obj.recvData();
      obj.getStatus();
   }
}