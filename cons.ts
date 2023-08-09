class category{
    categoryId:number;
    categoryName:string;

    constructor(id:number,name:string)
    {
        this.categoryId=id;
        this.categoryName=name;
    }
}

class product{
    productId:number;
    productName:string;
    productPrice:number;
    productStock?:boolean;
    category?:category;

    constructor(id:number,productName:string,price:number,stock?:boolean,category?:category){
        this.productId=id;
        this.productName=productName;
        this.productPrice=price;
        this.productStock=stock;
        this.category=category;
    }
    display(){
        console.log(`Category Id: ${this.category?.categoryId} and ${this.category?.categoryName} `);
        console.log(`product Id: ${this.productId} and Available ${this.productStock} product Name: ${this.productName}`);
    }
}
let cat:category=new category(10,"Electronics");
let prod:product=new product(101,"mobile",12000,true,cat);
prod.display();
let prod1:product=new product(102,"mobile",12000);
prod1.display();