public class Photo {
        public String Size;
        public String Resolution;
        public String GPS;
        public int Date;

        public String getSize() {
                return Size;
        }

        public void setSize(String Size) {
                this.Size = Size;
        }

        public String getResolution() {
                return Resolution;
        }

        public void setResolution(String Resolution) {
                this.Resolution = Resolution;
        }

        public String getGPS() {
                return GPS;
        }

        public void setGPS(String GPS) {
                this.GPS = this.GPS;
        }
        public int getDate(){
                return Date;
        }
        public void setDate(int Date){
                this.Date = Date;
        }

        public Photo(String Size, String Resolution,
                       String GPS, int Date) {
                this.Size = Size;
                this.Resolution = Resolution;
                this.GPS = GPS;
                this.Date = Date;
        }
}
