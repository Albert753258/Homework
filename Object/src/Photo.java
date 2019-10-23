public class Photo {
        public String Size;
        public String Resolution;
        public String GPS;
        public String Date;

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

        public void setGPS() {
                this.GPS = GPS;
        }
        public String getDate(){
                return Date;
        }
        public void setDate(){
                this.Date = Date;
        }

        public Photo(String Size, String Resolution,
                       String GPS, String Date) {
                this.Size = Size;
                this.Resolution = Resolution;
                this.GPS = GPS;
                this.Date = Date;
        }
}
