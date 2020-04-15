//here Class Money is the Super or base class and Country is the Extended or child or inheritated class or sub class
//The super function Line 21 sends the value passed in Country class to Main class or super class and the values are then passed to its class methods.
// Inheritance Helps in adding new Features to the Existing Class without Changing or affectiing the Structure

class Money{
  String name;
  double value;

  Money(this.name,this.value);

  void showOp(){
    print(name);
    print(value);
  }
}

class Country extends Money{

String countryN;

Country(String name,double value,this.countryN):super(name,value);

void showOutput(){
    super.showOp();
    print(countryN);
}

}

void main(){
/*
Money india = Money("Rupees",10);
india.showOp();
*/

Country india = Country("Rupiaa",10,"India");
india.showOutput();


}
