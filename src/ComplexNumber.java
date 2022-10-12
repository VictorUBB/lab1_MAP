public class ComplexNumber {
   private int real;
   private int img;
   ComplexNumber(int real,int img){
      this.real=real;
      this.img=img;
   }
   ComplexNumber(ComplexNumber cn){
      this.real=cn.getReal();
      this.img=cn.getImg();
   }
   public int getReal(){
      return this.real;
   }

   public int getImg() {
      return img;
   }

   public void adunare(ComplexNumber cn){
         this.real+= cn.getReal();
         this.img+=cn.getImg();
   }
   public void scadere(ComplexNumber cn){
      this.real+= cn.getReal();
      this.img+=cn.getImg();
   }
   public void inmultire(ComplexNumber cn){
      this.real=this.real*cn.getReal()+this.img*cn.getImg();
      this.img=this.real*cn.getImg()+this.img*cn.getReal();
   }
   public void impartire(ComplexNumber cn){
    ComplexNumber cnConj=cn;
    cnConj.conjugat();
    this.inmultire(cnConj);
    cn.inmultire(cnConj);
    this.real=this.real/cn.getReal();
    this.img=this.img/cn.getReal();
   }
   public void conjugat(){
      this.img=this.img*(-1);
   }
    public void show(){
        System.out.println("Parte reala:");
       System.out.println(this.real);
        System.out.println("\n");
        System.out.println("Parte img:");
        System.out.println(this.img);
        System.out.println("\n");
    }
}
