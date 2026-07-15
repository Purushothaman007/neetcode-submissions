/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
      Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      int cnt=0;
      for(int i=0;i<intervals.size();i++)
      {
        int ending=intervals.get(i).end;
        if(!pq.isEmpty() && pq.peek()<=intervals.get(i).start)
        {
            pq.poll();
        }
        pq.offer(ending);
      }

      return pq.size()-cnt;
    }
}
