import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class Checker extends GraphicsProgram {

		public void run() {
			
				for(int i = 0; i < N_ROWS; i++) {
					double sqSize = (double) getHeight() / N_ROWS;
					double position = (double) getWidth() / 2  - (N_COLUMNS * sqSize) / 2;
					double offset = (sqSize - sqSize / CHECKER_RATIO) / 2;
					for(int j = 0; j < N_COLUMNS; j++) {
						double x = j * sqSize + position;
						double y = i * sqSize;
						GRect rect = new GRect(x, y, sqSize, sqSize);
						if((i + j) % 2 != 0 ) {
							rect.setFilled(true);
							rect.setFillColor(Color.GRAY);
							add(rect);
							if(i < 3) {
								GOval checkr = new GOval(x + offset, y + offset, sqSize / CHECKER_RATIO, sqSize / CHECKER_RATIO);
								checkr.setFilled(true);
								checkr.setFillColor(Color.RED);
								add(checkr);
							}
								if(i >= 5) {
									GOval checkr = new GOval(x + offset, y + offset, sqSize / CHECKER_RATIO, sqSize / CHECKER_RATIO);
									checkr.setFilled(true);
									checkr.setFillColor(Color.BLACK);
									add(checkr);
								}
							
						}
					}
				}
		}
		private static final int N_ROWS = 8;
		private static final int N_COLUMNS = 8;
		private static final double CHECKER_RATIO = 1.3;
}
