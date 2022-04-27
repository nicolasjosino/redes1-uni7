import socket

sock_client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
sock_client.connect(("10.54.3.232", 8080))
while True:
    sock_client.send(input("Digite a mensagem:").encode())
    print(sock_client.recv(1024))