class Solution {
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].replace("-","").matches("[0-9]+"))
                s.push(Integer.parseInt(tokens[i]));
            else
                {
                int a = s.pop();
                int b = s.pop();
                
                switch (tokens[i]){
                    case"+":{
                        s.push(a+b);
                        break;
}
                        case"-":{
                        s.push(b-a);
                        break;
}
                        case"*":{
                        s.push(a*b);
                        break;
}
                        case"/":{
                        s.push(b/a);
                        break;
}
                }
    }
        }
        
        return s.pop();
        
    }
   
}
