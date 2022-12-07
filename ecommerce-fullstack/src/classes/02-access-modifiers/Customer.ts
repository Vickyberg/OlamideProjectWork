class Customer{
    private  _firstName: string;
    private _lastName: string;
    constructor(theFirst: string, theLast:string) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }

    public  get firstName():string{
        return this._firstName;
    }

    public set firstName(value){
        this._firstName = value;
    }

    public get lastName():string{
        return this.lastName;
    }

    public set lastName(value){
        this.lastName = value;
    }
}

let myCustomer = new Customer("Martins", "Dickson");


console.log(myCustomer.firstName);
console.log(myCustomer.lastName);