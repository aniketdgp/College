/*
for creating package:   javac -d . filename.java
for acessing package import.packagename.classname;

*/

import animals.Mamal;

class Test{
    public static void main(String[] args){

        Mamal a = new Mamal();
        a.eat();
        a.travel();

    }
}