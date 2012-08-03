from django.db import models
from django.contrib import admin

class Cliente(models.Model):
	nome = models.CharField(max_length=128)
	email = models.EmailField(max_length=128)
	boletim = models.BooleanField()
	
	def __unicode__(self):
		return self.nome

admin.site.register(Cliente)
