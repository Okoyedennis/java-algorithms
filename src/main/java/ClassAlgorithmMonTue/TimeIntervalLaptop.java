package ClassAlgorithmMonTue;

import java.util.ArrayList;
import java.util.List;

public class TimeIntervalLaptop {
    //    You're given a list of time intervals during which students at a school need a laptop. These time intervals are represented by pairs of integers [start, end], where 0 <= start < end. However, start and end don't represent real times; therefore, they may be greater than 24.
//
//    No two students can use a laptop at the same time, but immediately after a student is done using a laptop, another student can use that same laptop. For example, if one student rents a laptop during the time interval [0, 2], another student can rent the same laptop during any time interval starting with 2.
//
//    Write a function that returns the minimum number of laptops that the school needs to rent such that all students will always have access to a laptop when they need one.
    public static void main(String[] args) {

    }

//    a =[[0,2],[0,4],[1,4],[3,10],[4,6],[7,8],[9,11]]
//    c =0
//    d =
//
//    len(a)
//#
//
//    print(a[c:d])
//    #an=a[c:d]
//    g =[]
//    f =[]
//    n =1
//    g.append(a[0])
//    while c <=
//
//    len(a)-1:
//    an =a[c:d]
//
//    print("a =",a[c:d])
//    for start,
//    end in
//    an[1:]:
//            if start >=an[0][1]
//    and end >an[0][0]:
//            if[start,end]
//    in g:
//    pass
//            else:
//                    g.append([start,end])
//            #
//
//    print(start, end)
//
//    print()
//            #n +=1
//
//    print("Only one laptop is ok")
//        else:
//                if[start,end]
//    in f:
//    pass
//            else:
//                    f.append([start,end])
//    n +=1
//
//    print("More than one laptop")
//            #n +=1
//
//    c +=1
//
//    print(c)
//
//    print("n = ",n)
//
//    print("g = ",g)
//
//    print("f = ",f)

    public static Integer laptopRentals(List<List<Integer>> times) {
        int number = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < times.size(); i++) {
            if (number >= 1) {
                list.add(number);
            } else {
                return 1;

            }
        }
        return 1;

    }
}
