package pac;

public class SearchData {
   
   String name;
   int price;
   String category;
   String img;
   
   public SearchData(String name, int price, String category, String img) {
      
      this.name = name;
      this.price = price;
      this.category = category;
      this.img = img;
   }

   
   public String getName() {
      return name;
   }


   public void setName(String name) {
      this.name = name;
   }


   public int getPrice() {
      return price;
   }


   public void setPrice(int price) {
      this.price = price;
   }


   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }


   public String getImg() {
      return img;
   }


   public void setImg(String img) {
      this.img = img;
   }
   
   
}