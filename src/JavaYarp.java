
// JavaYarp tester - based on Example1.java from yarp/bindings example
//--------------------------------------------------------------------------------------
//
//  File:       JavaYarp.java
//
//  Project:    JavaYarp
//
//  Contains:   Sample Java Yarp project
//
//  Written by: Johnty Wang
//
//  Copyright:  (c) 2014 by HPlus Technologies Ltd. and Simon Fraser University.
//
//              All rights reserved. Redistribution and use in source and binary forms,
//              with or without modification, are permitted provided that the following
//              conditions are met:
//                * Redistributions of source code must retain the above copyright
//                  notice, this list of conditions and the following disclaimer.
//                * Redistributions in binary form must reproduce the above copyright
//                  notice, this list of conditions and the following disclaimer in the
//                  documentation and/or other materials provided with the
//                  distribution.
//                * Neither the name of the copyright holders nor the names of its
//                  contributors may be used to endorse or promote products derived
//                  from this software without specific prior written permission.
//
//              THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
//              "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
//              LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
//              PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
//              OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
//              SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
//              LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
//              DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
//              THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
//              (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
//              OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
//
//  Created:    2014-03-15
//
//--------------------------------------------------------------------------------------
 

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
