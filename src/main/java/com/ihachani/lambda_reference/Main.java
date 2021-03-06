/*
 *    Copyright 2016 lonsomehell
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.ihachani.lambda_reference;

public class Main {

    public static void main(String[] argv) {
        oldWay();
        lambdaWay();
        methodReferenceWay();
    }


    public static void oldWay() {
        Speaker speaker = new Speaker(new Speech() {
            public void speak(String speech) {
                System.out.println("Old way " + speech);
            }
        });
        speaker.talk();
    }

    public static void lambdaWay() {
        Speaker speaker = new Speaker((speech) -> {
            System.out.println("Lambda " + speech);
        });
        speaker.talk();
    }


    public static void methodReferenceWay() {
        Speaker speaker = new Speaker(Main::speakMethod);
        speaker.talk();
    }

    private static void speakMethod(String speech) {
        System.out.println("Method Reference" + speech);
    }

}
