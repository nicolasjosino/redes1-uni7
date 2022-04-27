import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(("0.0.0.0", 8080))
server.listen()

client, end_client = server.accept()
print(f"received connection from: {end_client}")
msg = client.recvfrom(1024)
print(f"msg")
client.send(b"message received!")
