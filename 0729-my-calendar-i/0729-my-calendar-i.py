class MyCalendar:

    def __init__(self):
        self.bookings = []   # store all intervals

    def book(self, startTime: int, endTime: int) -> bool:
        for s, e in self.bookings:

            # conflict if: start < e AND end > s
            if startTime < e and endTime > s:
                return False

        # no conflict → add booking
        self.bookings.append((startTime, endTime))
        return True
