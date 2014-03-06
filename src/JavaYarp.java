/*
 * JavaYarp tester - based on Example1.java from yarp/bindings example
 * Johnty Wang 2014 HPlusTech (johntywang@gmail.com)
 */

import yarp.Network;
import yarp.Bottle;
import yarp.Time;
import yarp.Port;

class JavaYarp {

	public static void main(String[] args) {
		System.loadLibrary("jyarp");
		Network.init();
		Port p = new Port();
		p.open("/JavaYarp");
		Network.connect("/JavaYarp","/reader");
		for (int i=0; i<10; i++) {
		    Bottle bot = new Bottle();
		    bot.addString("hello");
		    bot.addInt(i);
		    System.out.println("sending bottle number "+ (i+1));
		    p.write(bot);
		    Time.delay(1);
		}
		p.close();
    }
}
