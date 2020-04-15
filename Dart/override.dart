class veichle{

  String model;
  double price;

  veichle(this.model,this.price);

  void showOp(){
    print(model);
    print(price);
  }

}

class Car extends veichle{
  String brand;
  Car(String model,double price,this.brand):super(model,price);

  @override
  void showOp(){
    super.showOp();
    print(price);
  }

}


void main(){

  Car honda = Car("BVJ6",34578.0,"Honda BRV");
  honda.showOp();

}