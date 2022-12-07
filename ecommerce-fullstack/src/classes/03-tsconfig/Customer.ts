class Customer{

    constructor(private _firstName: string, private  _lastName:string) {
        this._firstName = _firstName;
        this._lastName = _lastName;
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