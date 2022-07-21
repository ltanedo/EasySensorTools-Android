import sensor_pb2

trip = sensor_pb2.Trip()
trip.ParseFromString(open("temp6.pb", "rb").read())
print(trip)