class Solution {
    public List<Integer> grayCode(int n) {
        List<String> ans = graycodeString(n);
        List<Integer> res = new ArrayList<Integer>();
        for (int i=0; i<ans.size(); i++)
        {
            res.add(binarytoint(ans.get(i));
        }
        return res;
    }
    public List<String> graycodeString (int n) {
        List<String> gray = new ArrayList<String>();
        if (n == 1)
        {
            gray.add("0");
            gray.add("1");
            return gray;
        }
        else
        {
            gray = graycodeString (n-1);
        }
        
        List<String> ans = new ArrayList<>();
        
        for (int i=0; i<gray.size(); i++)
        {
            ans.add("0" + gray.get(i));
        }
        
        for (int i=gray.size()-1; i>=0; i--)
        {
            ans.add("1"+ gray.get(i));
        }
        return ans;
    }
    public int binarytoint(String bin)
    {
        return (Integer.parseInt(bin,2));
    }
}
