package Personal;

public class singletonDP {
    private static singletonDP instanceOfObject = new singletonDP();

    private singletonDP(){}

    public static singletonDP getInstance(){
        if (instanceOfObject == null){
            instanceOfObject = new singletonDP();
        }
        return instanceOfObject;
    }


    public void printMessage(){
        System.out.println("Hello Everyone in java stack");
    }

    public static void main(String[] args) {
        //Get the only object available
        singletonDP object = singletonDP.getInstance();


        //show the message
        object.printMessage();

    }
}

//DI
//How we provide a object what an object require to carryout its intended purpose.(The objects dependencies). It makes your code not to be tightly coupled but losely coupled

// IOC container is a framework in charge of creating injection dependencies where needed

//Spring stereotype: Service, Repository, Controller, Rest controller, Component.

//Spring bean scope: Singleton, Prototype, Web aware, Request, Session, Application, Web Socket Scope.

//THREE types of Dependency Injection
//1 constructor injection: the dependencies are provided through a class constructor.
// If dependency are not provided the class will never be instantiated.
// 2 setter injection: the client exposes a setter method that the injector uses to inject the dependency.
// 3 field injection: It uses reflectional under the hood and tries to inject dependency, which is a complex injection its not to desirable.

// 3 Annotation: Enable auto config, Component Scan, Springboot Config.

// JPA: is a collection of classes and method when you want to store data in your database. It is provided by spring and helps us manage data eg Hibernate, mybatis apache, open JPA etc.

//ACID: Properties are used to maintain integrity and consistency in a database, before and after a transaction is made certain properties are followed. These are called ACID properties.

// Atomicity: This means that either the entire transaction takes place at once or doesn't happen at all. There is no midway meaning transaction do not occur partially

//