import socket

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(("0.0.0.0", 3912))

sock.sendto("Pix de R$1500,00.".encode(), ("10.54.41.26", 3912))

msg = sock.recvfrom(1024)
print(msg)
print(msg)