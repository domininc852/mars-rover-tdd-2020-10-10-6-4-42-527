# Mars Rover

Imagine you are in charge of software development on the Mars exploration team. Now you have to write a control program for the exploration vehicle landing on Mars, and control the actions of the rover according to the control controller sent by the earth.

The controller received by the rover fall into three categories:

1. Initialization information:
     The landing location (x, y) and heading (N, S, E, W) information of the rover;
2. Move controller:
     The rover can move forward (M), one space at a time;
3. Turn controller:
     The rover can turn left 90 degrees (L) or right 90 degrees (R).

Due to the long distance between the Earth and Mars, the controller must be sent in batches. After the rover executes the complete batch of controller, it will report its location coordinates and heading.