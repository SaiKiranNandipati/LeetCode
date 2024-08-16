import java.util.*;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {

        int cur_min=arrays.get(0).get(0);
        int cur_max=arrays.get(0).get(arrays.get(0).size()-1);

        int res=Integer.MIN_VALUE;

        for(int i=1;i<arrays.size();i++)
        {
            res=Math.max(res,Math.abs(Math.max(cur_max-(arrays.get(i).get(0)),arrays.get(i).get(arrays.get(i).size()-1)-cur_min)));

            cur_min=Math.min(cur_min,arrays.get(i).get(0));
            cur_max=Math.max(cur_max,arrays.get(i).get(arrays.get(i).size()-1));

            // System.out.println("cur_min: "+cur_min);
            // System.out.println("cur_max: "+cur_max);
        }

        return res;
    }
}

