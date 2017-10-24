import java.util.List;
import java.util.ArrayList;

/**
 * This class provides a main method for experimenting with GraphDB construction.
 * You could also use MapServer, but this class lets you play around with
 * GraphDB in isolation from all the rest of the parts of this assignment.
 */
public class GraphDBLauncher {
    private static final String OSM_DB_PATH = "berkeley.osm";

    public static void main(String[] args) {
        GraphDB g = new GraphDB(OSM_DB_PATH);

        Iterable<Long> verticesIterable = g.vertices();

        /* Convert iterable to a list. */
        List<Long> vertices = new ArrayList<Long>();
        for (long v : verticesIterable) {
            vertices.add(v);
        }

//        System.out.println("There are " + vertices.size() + " vertices in the graph.");

//        System.out.println("The first 10 vertices are:");
//        for (int i = 0; i < 10; i += 1) {
//            if (i < vertices.size()) {
//                System.out.println(vertices.get(i));
//            }
//        }

//        long v = g.closest(-122.258207, 37.875352);
        double startlon = -122.23354274523257;
        double startlat = 37.87383979834944;
        double destlon = -122.23307272570244;
        double destlat = 37.86020837234193;
        long start = 760706748;
        long fin = 92721185;
        long v = g.closest(startlon, startlat);
        long end = g.closest(destlon, destlat);
        System.out.print("The vertex number closest to -122.23354274523257, 37.87383979834944 is " + v + ", which");
        System.out.println(" has longitude, latitude of: " + g.lon(v) + ", " + g.lat(v));
        System.out.println(g.adjacent(v));
        for (long n : g.adjacent(v)) {
            System.out.println(g.distance(v, n) + g.distance(n, end));
        }

        //[760706748, 3178363987, 760706509, 760706508, 3257627657, 3257627656, 3257627655, 760706507,
        // 35719130, 760706506, 35719129, 760706505, 760706504, 760706503, 760706502, 760706501,
        // 35719128, 760706500, 760706499, 760706498, 251225766, 760706497, 35719127, 760706496,
        // 760706495, 251225765, 760705995, 251225764, 760705992, 35719126, 251225761, 760705985,
        // 251225760, 760705984, 760705983, 35719125, 760705982, 251225763, 3257627654, 760705979,
        // 760705977, 251225762, 760705974, 35719124, 760705970, 760705968, 760705967, 1329086501,
        // 35719123, 35719122, 760705966, 760705964, 699550674, 760705962, 35719121, 760705960,
        // 760705958, 760705957, 1329086484, 35719120, 1329086468, 760705954, 760705952, 760705950,
        // 35719119, 828422577, 35719115, 35719114, 760702320, 760702317, 35719113, 760702315,
        // 760702313, 760702311, 35719112, 35719111, 760874901, 35719110, 760874929, 35719109,
        // 760874908, 444157967, 53054999, 309013415, 760874887, 53055000, 56819228, 53058932,
        // 2252623318, 53020994, 267631963, 267631954, 53058934, 394216370, 394216371, 267631967,
        // 696215423, 53058936, 394180802, 1419660772, 267632093, 267632092, 267632091, 267632090,
        // 53092735, 1419661068, 53111879, 1419660793, 53111880, 394180763, 394180764, 53081908,
        // 267632051, 843009175, 394180759, 267632052, 53082163, 394180756, 57059663, 394180757,
        // 394180758, 57059669, 53154694, 394180751, 53082603, 2252623198, 53082604, 267632099,
        // 407681216, 53060399, 53060401, 663085906, 53060402, 1214221907, 1214221837, 53088582,
        // 394179841, 394179843, 1214221905, 394179845, 1214221877, 53088583, 1214221916, 53088585,
        // 1214221839, 514117760, 53047456, 1214221835, 514117761, 3964998892, 1214221880, 1214221913,
        // 1214221851, 53031582, 1214221859, 394179290, 1214221845, 1214221846, 267632138, 1214221898,
        // 1214221861, 267632134, 1214221870, 1214221893, 267632129, 267632124, 267632117, 267632111,
        // 53086332, 1214221894, 394179289, 92773135, 92773129, 267632173, 1214221891, 92760834, 661785284,
        // 92760821, 661785285, 661785287, 53086341, 267632181, 267632185, 661784799, 661784800, 53086342,
        // 3965001458, 661782144, 267632225, 92760811, 661782145, 92760803, 661782146, 267632223, 661782147,
        // 92760791, 661782148, 267632221, 661782149, 53086343, 53049943, 267632222, 661780379, 661780377,
        // 92760776, 92760787, 661780374, 661780371, 53049941, 661780356, 661780352, 53049939, 432426363,
        // 432426362, 432426361, 432426360, 432426359, 53100297, 92721207, 53066296, 53054876, 92721251,
        // 92721262, 92721268, 53041860, 92721276, 92721288, 92721300, 3386879841, 92721307, 53041859,
        // 92721195, 3386879840, 3386879839, 3386879838, 92721189, 3386879837, 3386879836, 3386879835,
        // 53041857, 92721175, 92721179, 92721185]
//        System.out.println("To get started, uncomment print statements in GraphBuildingHandler.");
    }
}
