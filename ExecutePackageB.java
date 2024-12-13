
import sortapp.subsortapp.SortImpl;

import searchingimpl.SearchImpl;
public class ExecutePackageB {
   public static void main(String[] args){
      SortImpl sort1=new SortImpl();
      SearchImpl search1=new SearchImpl();
      sort1.sort();
      search1.search();
   }
}
