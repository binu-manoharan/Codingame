package thor;

/**
 * Help Thor reach the light
 */
class ThorHelper {
    String getNextDirection(int lightX, int lightY, int thorX, int thorY) {
        if (lightY == thorY) {
            return thorX > lightX ? "W" : "E";
        }
        return "";
    }
}