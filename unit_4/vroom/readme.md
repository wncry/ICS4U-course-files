
# dealership class
- inventory:ArrayList<Car>

+ Class_Dealership()

+ get_cost_total():double
+ get_vroom_avg():double

+ add_car((int, double, double, String)
+ sell_car(int):void

+ toString():String


# car class
- vroomFactor: int
- make:String
- mpg: double
- cost: double
- {static}counter:int

+ Class_Cars(int, double, double, String)

+ get_vroom():int
+ get_make():String
+ get_mpg():double
+ get_cost():double
+ {static}get_count():int

+ set_mpg(double):void

+ get_distance(double gallons):double
+ get_gallons(double distance):double
+ toString():String
