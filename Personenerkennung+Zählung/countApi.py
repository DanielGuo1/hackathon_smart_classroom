#!flask/bin/python
from flask import Flask
import numpy as np


app = Flask(__name__)

@app.route('/api/rooms', methods=['GET'])
def app_findBy():
    y = np.loadtxt('/www/var/html/125')
    
    return str(y)

if __name__ == '__main__':
    app.run(debug=True)
