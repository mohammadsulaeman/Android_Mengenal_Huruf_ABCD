package com.example.mengenalhuruf

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mengenalhuruf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var soundA : MediaPlayer
    private lateinit var soundB : MediaPlayer
    private lateinit var soundC : MediaPlayer
    private lateinit var soundD : MediaPlayer
    private lateinit var soundE : MediaPlayer
    private lateinit var soundF : MediaPlayer
    private lateinit var soundG : MediaPlayer
    private lateinit var soundH : MediaPlayer
    private lateinit var soundI : MediaPlayer
    private lateinit var soundJ : MediaPlayer
    private lateinit var soundK : MediaPlayer
    private lateinit var soundL : MediaPlayer
    private lateinit var soundM : MediaPlayer
    private lateinit var soundN : MediaPlayer
    private lateinit var soundO : MediaPlayer
    private lateinit var soundP : MediaPlayer
    private lateinit var soundQ : MediaPlayer
    private lateinit var soundR : MediaPlayer
    private lateinit var soundS : MediaPlayer
    private lateinit var soundT : MediaPlayer
    private lateinit var soundU : MediaPlayer
    private lateinit var soundV : MediaPlayer
    private lateinit var soundW : MediaPlayer
    private lateinit var soundX : MediaPlayer
    private lateinit var soundY : MediaPlayer
    private lateinit var soundZ : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAction()
    }

    private fun initAction() {
        binding.imageA.setOnClickListener {
            soundA = MediaPlayer.create(this, R.raw.a)
            soundA.start()
        }
        binding.imageB.setOnClickListener {
            soundA.stop()
            soundB = MediaPlayer.create(this,R.raw.b)
            soundB.start()
        }
        binding.imageC.setOnClickListener {
            soundB.stop()
            soundC = MediaPlayer.create(this,R.raw.c)
            soundC.start()
        }
        binding.imageD.setOnClickListener {
            soundC.stop()
            soundD = MediaPlayer.create(this,R.raw.d)
            soundD.start()
        }
        binding.imageE.setOnClickListener {
            soundD.stop()
            soundE = MediaPlayer.create(this,R.raw.e    )
            soundE.start()
        }
        binding.imageF.setOnClickListener {
            soundE.stop()
            soundF = MediaPlayer.create(this,R.raw.f)
            soundF.start()
        }
        binding.imageG.setOnClickListener {
            soundF.stop()
            soundG = MediaPlayer.create(this,R.raw.g)
            soundG.start()
        }
        binding.imageH.setOnClickListener {
            soundF.stop()
            soundH = MediaPlayer.create(this,R.raw.h)
            soundH.start()
        }
        binding.imageI.setOnClickListener {
            soundH.stop()
            soundI = MediaPlayer.create(this,R.raw.i)
            soundI.start()
        }
        binding.imageJ.setOnClickListener {
            soundI.stop()
            soundJ = MediaPlayer.create(this,R.raw.j)
            soundJ.start()
        }
        binding.imageK.setOnClickListener {
            soundJ.stop()
            soundK = MediaPlayer.create(this,R.raw.k    )
            soundK.start()
        }
        binding.imageL.setOnClickListener {
            soundK.stop()
            soundL = MediaPlayer.create(this,R.raw.l)
            soundL.start()
        }
        binding.imageM.setOnClickListener {
            soundL.stop()
            soundM = MediaPlayer.create(this,R.raw.m)
            soundM.start()
        }
        binding.imageN.setOnClickListener {
            soundM.stop()
            soundN = MediaPlayer.create(this,R.raw.n)
            soundN.start()
        }
        binding.imageO.setOnClickListener {
            soundN.stop()
            soundO = MediaPlayer.create(this,R.raw.o)
            soundO.start()
        }
        binding.imageP.setOnClickListener {
            soundO.stop()
            soundP = MediaPlayer.create(this,R.raw.p)
            soundP.start()
        }
        binding.imageQ.setOnClickListener {
            soundP.stop()
            soundQ = MediaPlayer.create(this,R.raw.q)
            soundQ.start()
        }
        binding.imageR.setOnClickListener {
            soundQ.stop()
            soundR = MediaPlayer.create(this,R.raw.r)
            soundR.start()
        }
        binding.imageS.setOnClickListener {
            soundR.stop()
            soundS = MediaPlayer.create(this,R.raw.s)
            soundS.start()
        }
        binding.imageT.setOnClickListener {
            soundS.stop()
            soundT = MediaPlayer.create(this,R.raw.t)
            soundT.start()
        }
        binding.imageU.setOnClickListener {
            soundT.stop()
            soundU = MediaPlayer.create(this,R.raw.u)
            soundU.start()
        }
        binding.imageV.setOnClickListener {
            soundU.stop()
            soundV = MediaPlayer.create(this,R.raw.v)
            soundV.start()
        }
        binding.imageW.setOnClickListener {
            soundV.stop()
            soundW = MediaPlayer.create(this,R.raw.w)
            soundW.start()
        }
        binding.imageX.setOnClickListener {
            soundW.stop()
            soundX = MediaPlayer.create(this,R.raw.x)
            soundX.start()
        }
        binding.imageY.setOnClickListener {
            soundX.stop()
            soundY = MediaPlayer.create(this,R.raw.y)
            soundY.start()
        }
        binding.imageZ.setOnClickListener {
            soundY.stop()
            soundZ = MediaPlayer.create(this,R.raw.z)
            soundZ.start()
        }
    }
}