// https://leetcode.com/problems/distance-between-bus-stops/

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockwise = 0, anticlockwise = 0;
        int i = start;
        
        while(i != destination) {
            clockwise += distance[i];
            i = (i + 1)%distance.length;
        }
        
        while(i != start) {
            anticlockwise += distance[i];
            i = (i + 1)%distance.length; 
        }
        
        return Math.min(anticlockwise, clockwise);
    }
}
