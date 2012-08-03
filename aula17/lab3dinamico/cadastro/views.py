# Create your views here.

from django.shortcuts import render
from .models import Cliente

def form_cadastro(request):
	return render(request, 'formulario.html')

def listar_cadastro(request):
	clientes = Cliente.objects.all().order_by('nome')
	return render(request, 'listagem.html', {'clientes':clientes})
